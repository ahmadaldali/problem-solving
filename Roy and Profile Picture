process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;                               // Reading input from STDIN
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function solve(data) {
    const L = parseInt(data[0]);
    const N = parseInt(data[1]);
 
    for (let i= 0; i < N ;i++) {
        const dim = data[i+2].split(" ");
        const W = dim[0];
        const H = dim[1];
 
        if (W < L || H < L) {
            console.log("UPLOAD ANOTHER")
        } else {
            if (W == H) console.log("ACCEPTED")
            else console.log("CROP IT")
        }
    }
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
