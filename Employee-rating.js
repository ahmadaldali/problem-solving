process.stdin.resume();
process.stdin.setEncoding('utf-8');
 
var input_ = "";
 
process.stdin.on('data', function (data) {
    input_ += data.toString().trim();
    input_ += '\n';
});
function solve(N, workload) {
    let rate = 0;
    let currentConsecutiveLength = 0;
 
    for(let i=0;i<N;i++) {
        if (workload[i] > 6) {
            currentConsecutiveLength++
        } else {
            rate = currentConsecutiveLength >rate ? currentConsecutiveLength : rate;
            currentConsecutiveLength = 0;
        }
    }
    rate = currentConsecutiveLength >rate ? currentConsecutiveLength : rate;
 
    return rate;
 
}
process.stdin.on('end', function () {
    input_ = input_.replace(/\n$/, "");
    input_ = input_.split("\n");
 
    var idx_ = 0;
    var N = parseInt(input_[idx_++].trim(), 10);
    var workload = input_[idx_++].trim().split(' ').map(function(el) {
    	return parseInt(el, 10);
    });
 
    var out_ = solve( N,  workload);
    process.stdout.write(out_.toString());
 
    process.exit();
 
});
