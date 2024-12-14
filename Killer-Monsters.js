process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function solveTestCase(NStr, monstersStr) {
    const N = parseInt(NStr);
    const monsters = monstersStr.split(" ")
    
    let stack = [];
    let result = [];
    
    for(let i=0;i < monsters.length;i++) {
        const element = parseInt(monsters[i]);

        let top = stack.pop();
        while (top <= element) {
            top = stack.pop();
        }
        if (top > element) {
            stack.push(top)
        }
        
        stack.push(element);
        
        result.push(stack.length)
    }
    
    console.log(result.join(' '))
}
 
function solve(data) {
    const T = parseInt(data[0]);
    for (let i= 0; i < T ;i++) {
        solveTestCase(data[i*2+1], data[i*2+2])
    }
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
