process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function solve(data) {
    const [N,K] = data[0].split(" ");
    const A = data[1].split(" ").map((el) => Number(el));
 
    const pairedSet = new Set();
    for(let i=0;i<N;i++) {
        const current = A[i];
        if (K > current) {
            if (pairedSet.has(current)) {
                console.log("YES");
                return;
            }
 
            pairedSet.add(K-current);           
        }
    }
 
    console.log("NO");
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
