process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function solveTestCase(N,M,A) {
    A = A.sort((a,b) =>  a - b);
    let numberOfgivenSchools = 0
    let takenBoxes = 0;
 
    let canBeTaken = (takenBoxes + A[numberOfgivenSchools]) <= N;
    while (canBeTaken) {
        takenBoxes += A[numberOfgivenSchools];
        numberOfgivenSchools++;
 
        canBeTaken = numberOfgivenSchools < M ? (takenBoxes + A[numberOfgivenSchools]) <= N : false;
    }
 
    return numberOfgivenSchools;
}
 
function solve(data) {
    const T = parseInt(data[0]);
 
    for (let i= 0; i < T ;i++) {
        const [N, M] = data[i*2+1].split(" ");
        const A = data[i*2+2].split(" ").map((char) => Number(char));
 
        console.log(solveTestCase(N,M,A))
    }
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
