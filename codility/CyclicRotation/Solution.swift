import Foundation

public func solution(_ A : inout [Int], _ K : Int) -> [Int] {
    
    if A.count == 0 { return A }

    var last: Int = A.last!
    
    for _ in 0..<K {
        A.removeLast()
        A.insert(last, at: 0)
        last = A.last!
    }
    
    return A
}
