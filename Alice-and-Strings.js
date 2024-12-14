process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function canEqual(data) {
    const A = data[0];
    const B = data[1];
 
    if (A.length !== B.length) return 0;
 
    let maxDifference = 0;
    for (let i=A.length - 1; i>=0;i--) {
        let AiIndex = A[i].charCodeAt();
        let BiIndex = B[i].charCodeAt();
 
        let difference = BiIndex - AiIndex;
        if (difference >= maxDifference) {
            maxDifference = difference;
        }else {
            return 0;
        }
    }
 
    return 1;
}
 
function main(input) {
    const data = input.split("\n");
    const result = canEqual(data)
    console.log(result ? "YES" : "NO");
}
