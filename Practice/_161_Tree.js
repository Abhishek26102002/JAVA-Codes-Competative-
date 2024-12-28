class Node {
  constructor(value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }
}

// Create the nodes
const a = new Node("a");
const b = new Node("b");
const c = new Node("c");
const d = new Node("d");
const e = new Node("e");
const f = new Node("f");

// Construct the tree
a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.right = f;

//        a
//       / \
//      b   c
//     /\    \
//    d  e    f

// using stack
const DFS_stack = (root) => {
  const stack = [root];
  while (stack.length > 0) {
    const current = stack.pop();

    console.log(current.value);

    if (current.right) stack.push(current.right);
    if (current.left) stack.push(current.left);
  }
};

// using recursion
const DFS_recursion = (root) => {
  if (root === null) return [];

  const leftval = depthFirstValue2(root.left); // b d e
  const rightval = depthFirstValue2(root.right); // c f

  return [root.value, ...leftval, ...rightval];
};

const BFS_queue = (root) => {
  if (root === null) return [];

  const toReturn = [];
  const queue = [root];

  while (queue.length > 0) {
    const current = queue.shift();
    toReturn.push(current.value);

    if (current.left !== null) queue.push(current.left);
    if (current.right !== null) queue.push(current.right);
  }

  return toReturn;
};

// console.log(DFS_stack(a));
// Expected Output: a, b, d, e, c, f
// console.log(DFS_recursion(a));
// console.log(BFS_queue(a));

// @here are some Basic Questions

// 1.Find target ele in BT
const FindEle = (root, target) => {
  if (root === null) return false;

  const queue = [root];

  while (queue.length > 0) {
    const current = queue.shift();

    if (current.value === target) return true;

    if (current.left !== null) queue.push(current.left);
    if (current.right !== null) queue.push(current.right);
  }
  return false;
};

// console.log(FindEle(a, 'g'));

// 2.using Recursion
const FindEleRecursion = (root, target) => {
  if (root === null) return false;
  if (root.value === target) return true;

  return (
    FindEleRecursion(root.left, target) || FindEleRecursion(root.right, target)
  );
};

// console.log(FindEleRecursion(a,'f'));

// 3. Find Total Sum (Recursion)
const treeSum = (root) => {
  if (root === null) return 0;

  return root.value + treeSum(root.left) + treeSum(root.right);
};
console.log(treeSum(a));

//  4. Sum of tree
const treeSum2 = (root) => {
  if (root === null) return 0;

  const queue = [root];
  const totalSum = 0;
  while (queue.length > 0) {
    const current = queue.shift();
    totalSum += current.value;

    if (current.left !== null) queue.push(current.left);
    if (current.right !== null) queue.push(current.right);
  }
  return totalSum;
};

console.log(treeSum2(a));

// 5. min value in the tree

const minVal = (root) => {
  let smallest = Infinity;

  const stack = [root];

  while (stack.length > 0) {
    const current = stack.pop();

    if (current.value < smallest) smallest = current.value;

    if (current.left !== null) stack.push(current.left);
    if (current.right !== null) stack.push(current.right);
  }
  return smallest;
};
console.log(minVal(a));
