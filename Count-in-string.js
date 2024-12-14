process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function solve(S, k) {
    const S_Arr = S.split("");
    const S_Arr_k = S_Arr.filter((char) => char === k);
    
    return S_Arr_k.length;
}
 
function main(input) {
    const data = input.split("\n");
    const T = parseInt(data[0]);
    
    for (let i= 0; i < T ;i++) {
        const S = data[2*i+1];
        const K = data[2*i+2];
        console.log(solve(S,K))
    }
}
