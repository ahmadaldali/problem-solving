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
    const [N, K] = data[0].split(" ");
    const A = data[1].split(" ").map(element => Number(element));
    
    let result = A[0]; //at least one element from the stack
    
    let i=1;
    while (A[i] >= A[N-K+i]) {
        result += A[i];
        i++;
    }
    
    // suppose all other items now from stack and nothing from queue
    let stackSum = A.slice(i,K).reduce((a, b) => a + b, 0);
    let queueSumFormRemaining = 0;
    let max = stackSum + queueSumFormRemaining;
    
    // let's see if we start taking elements from the queue instead of the stack
    let numberOfTakenQueueItems = 1;
    for (let j=K-1;j>=i;j--) {
        stackSum -= A[j]; // decrease from the sum instead of recacluating the sum every time
        queueSumFormRemaining += A[N-numberOfTakenQueueItems];
        numberOfTakenQueueItems += 1;
        
        // check if we have better max value
        max = max > stackSum + queueSumFormRemaining ? max : stackSum + queueSumFormRemaining;
    }
    
    console.log(result+max);
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
