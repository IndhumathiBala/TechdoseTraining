class Main
{
	int find(int A[],int X)
        {
          if(A[X]==X)
          {
              return X;
          }
          return find(A,A[X]);
	}
	void unionSet(int A[],int X,int Z)
        {
            X=find(A,X);
            Z=find(A,Z);
            A[X]=Z;
	    }
}
