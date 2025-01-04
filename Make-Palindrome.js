process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";

process.stdin.on("data", function (input) {
    stdin_input += input;
});

process.stdin.on("end", function () {
   main(stdin_input);
});

function calculateCost(S,N) {
    const charsOccuring = new Map([])
    for(let i=0;i<N;i++) {
        const char = S[i];
        const charInMap = charsOccuring.get(char) ?? 0;

        charsOccuring.set(char, charInMap+1)
    }
    
    let oddCount = 0;
    charsOccuring.forEach (function(value, key) {
        if (value % 2 === 1) {
            oddCount++;
        }
    })
    
    if (N % 2 === 0) {
        return (oddCount > 0 && oddCount % 2 === 0) ? oddCount - 1 : oddCount;
    } else {
        return oddCount - 1;
    }
}

function solve(data) {
    const T = parseInt(data[0]);

    let line=0;
    for (let i= 1; i <= T ;i++) {
        line++;
        const N = parseInt(data[line]);
        line++;
        const S = data[line];
        console.log(calculateCost(S,N))
    }
}

function main(input) {
    const data = input.split("\n");
    solve(data)
}
