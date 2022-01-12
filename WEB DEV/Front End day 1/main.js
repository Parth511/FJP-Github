(function(){
    let btnAddFolder = document.querySelector("#btnAddFolder");
    let divContainer = document.querySelector("#divContainer");
    let pageTemplates = document.querySelector("#pageTemplates");
    let fid = 0;
    let folders = [];

    btnAddFolder.addEventListener("click", addFolder);

    function addFolder(){
        let fname = prompt("Enter folder's name");
        if(!!fname){
            fid++;
            addFolderHTMLToPage(fname, fid);

            folders.push({
                id: fid,
                name: fname
            });
            persistDataToStorage();
        }
    }

    function editFolder(){
        let divFolder = this.parentNode; 
        let divName = divFolder.querySelector("[purpose='name']");

        let fname = prompt("Enter new folder's name for " + divName.innerHTML);
        if(!!fname){
            divName.innerHTML = fname;

            let fid = parseInt(divFolder.getAttribute("fid"));
            let folder = folders.find(function(f){
                return f.id == fid;
            });
            folder.name = fname;

            persistDataToStorage();
        }
    }

    function deleteFolder(){
        let divFolder = this.parentNode; 
        let divName = divFolder.querySelector("[purpose='name']");

        let flag = confirm("Do you want to delete " + divName.innerHTML);
        if(flag){
            divContainer.removeChild(divFolder);

            let fid = parseInt(divFolder.getAttribute("fid"));
            let idx = folders.findIndex(function(f){
                return f.id == fid;
            });
            folders.splice(idx, 1);

            persistDataToStorage();
        }
    }

    function addFolderHTMLToPage(fname, fid){
        let divFolderTemplate = pageTemplates.content.querySelector(".folder");
        let divFolder = document.importNode(divFolderTemplate, true);

        let divName = divFolder.querySelector("[purpose='name']");
        let spanEdit = divFolder.querySelector("[action='edit']");
        let spanDelete = divFolder.querySelector("[action='delete']");

        divName.innerHTML = fname;
        spanEdit.addEventListener("click", editFolder);
        spanDelete.addEventListener("click", deleteFolder);
        divFolder.setAttribute("fid", fid);

        divContainer.appendChild(divFolder);
    }

    function persistDataToStorage(){
        let fjson = JSON.stringify(folders);
        localStorage.setItem("data", fjson);
    }

    function loadDataFromStorage(){
        let fjson = localStorage.getItem("data");
        if(!!fjson){
            folders = JSON.parse(fjson);
            let maxId = -1;
            folders.forEach(f => {
                addFolderHTMLToPage(f.name, f.id);
                if(f.id > maxId){
                    maxId = f.id;
                }
            });

            fid = maxId;
        }
    }

    loadDataFromStorage();
})();