let insertIntoBST = function (root, value){
    node = root;
    while(1){
        if(value>= node.value){
            if(node.right){
                node = node.right;
                continue;
            }
            else {
                node.right = new TreeNode(value);
                break;
            }  
        } else {
            if (node.left){
                node = node.left;
                continue;
            }
            else {
                node.left = new TreeNode(value);
                break;
            }
        }
        return root;
    }
}

class TreeNode {
    value;
    left;
    right;

    constructor(value){
        this.value = value;
    }
}

let root = new TreeNode(3);
insertIntoBST(root, 4);
insertIntoBST(root,10);
insertIntoBST(root,1);
console.log(root);