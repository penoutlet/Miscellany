let insertTreeNode = function (root, value){
    node = root;

    while(node!=null){
            if (value >= node.value){
                if(node.right){
                    node = node.right;
                continue;
                }
                else {
                    node.right = new TreeNode(value);
                    break;
                }
            }
        else {
                if(value < node.value) {
                    if(node.left){
                        node = node.left;
                        continue;
                    }
                }
                else {
                    node.left = new TreeNode(value);
                    break;
                }
            }
        
    }
}

function TreeNode(value){
    this.value = value;
    this.right = null;
    this.left = null;
}

let n1 = new TreeNode(1);
let n2 = new TreeNode(3);
let n3 = new TreeNode(10);

insertTreeNode(n1,n2);
insertTreeNode(n1,n3);
// insertTreeNode(n3);
console.log(n1)