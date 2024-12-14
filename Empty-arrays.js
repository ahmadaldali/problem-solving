process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function applyFirstOperation(arr) {
    const element = arr.shift();
    arr.push(element)
    
    return arr
}
 
function calculateTime(aStr, bStr) {
    a = aStr.split(" ");
    b = bStr.split(" ");
    let time = 0;
    while (a.length > 0) {
        while (parseInt(a[0]) != parseInt(b[0])) {
            a = applyFirstOperation(a);
            time++
        }
            a.shift();
            b.shift()
      
        time++;
    }
    
    console.log(time);
}
 
 
function solve(data) {
    const A = data[1];
    const B = data[2];
    calculateTime(A, B);
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
