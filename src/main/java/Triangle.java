public class Triangle{

  private int mSide1;
  private int mSide2;
  private int mSide3;

  public Triangle(int side1, int side2, int side3){
    mSide1 = side1;
    mSide2 = side2;
    mSide3 = side3;
  }

  public int getSide1() {
      return mSide1;
  }

  public int getSide2() {
      return mSide2;
  }

  public int getSide3() {
      return mSide3;
  }

  public boolean equilateralCheck() {
    if(mSide1 == mSide2 && mSide2 == mSide3) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isoscelesCheck() {
    if(mSide1 == mSide2 || mSide2 == mSide3 || mSide1 == mSide3) {
      return true;
    } else {
      return false;
    }
  }

  public boolean scaleneCheck() {
    if(mSide1 != mSide2 && mSide2 != mSide3 && mSide1 != mSide3) {
      if((mSide1 + mSide2 < mSide3) || (mSide3 + mSide2 < mSide1) || (mSide1 + mSide3 < mSide2) ){
        return false; //Not Triangle
      } else{
          return true; //Scalene
      }
    } else {
      return false; //Not Scalene
    }
  }


}
