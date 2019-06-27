/*Given a set of distinct integers, S, return all possible subsets. */

void helper(vector<int>& A, vector<vector<int> >& res,vector<int>& subset, int index) 
{ 
    sort(A.begin(), A.end());
    res.push_back(subset);
    
    for(int i = index; i < A.size(); i++){
        subset.push_back(A[i]);
        helper(A,res,subset,i+1);
        subset.pop_back();
    }
    return;
} 
vector<vector<int> > Solution::subsets(vector<int> &A) {
    vector<vector<int>> ans;
    vector<int> subset;
    
    int index = 0;
    helper(A,ans,subset,index);
    
    return ans;
}
