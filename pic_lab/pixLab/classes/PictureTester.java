/**
 * This class contains class (static) methods
 * that will help you test the Picture class
 * methods.  Uncomment the methods and the code
 * in the main to test.
 *
 * @author Barbara Ericson
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("water.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testKeepOnlyBlue(){
	Picture beach = new Picture("water.jpg");
    beach.keepOnlyBlue();
    beach.explore();
  }

  public static void testNegate(){
	Picture beach = new Picture("water.jpg");
    beach.negate();
    beach.explore();
  }

  public static void testGrayscale(){
	Picture beach = new Picture("water.jpg");
	beach.grayscale();
	beach.explore();
  }

  public static void testFixUnderwater(){
    Picture beach = new Picture("water.jpg");
    //beach.fixUnderwater();
    beach.explore();
  }

  public static void testMirrorVerticalRightToLeft(){
    Picture beach = new Picture("beach.jpg");
    beach.mirrorVerticalRightToLeft();
    beach.explore();
  }

  public static void testNormal(){
    Picture beach = new Picture("seagull.jpg");
    beach.explore();
  }

  public static void testMirrorHorizontal(){
    Picture beach = new Picture("beach.jpg");
    beach.mirrorHorizontal();
    beach.explore();
  }

  public static void testMirrorHorizontalBotToTop(){
    Picture beach = new Picture("beach.jpg");
    beach.mirrorHorizontalBotToTop();
    beach.explore();
  }

  public static void testMirrorArms(){
    Picture snowman = new Picture("snowman.jpg");
    snowman.mirrorArms();
    snowman.explore();
  }

  public static void testMirrorGull(){
    Picture gull = new Picture("seagull.jpg");
    gull.mirrorGull();
    gull.explore();
  }

  public static void testCopy(){
    Picture gull = new Picture("seagull.jpg");
    Picture moon = new Picture("moon-surface.jpg");
    gull.copy(moon,245,323,234,341);
    gull.explore();
  }

  public static void testOtherCopy(){
    Picture gull = new Picture("seagull.jpg");
    Picture snowman = new Picture("snowman.jpg");
    gull.copy(snowman,100,100);
    gull.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testNormal();
    //testMirrorArms();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVerticalRightToLeft();
    //testMirrorVertical();
    //testMirrorHorizontal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testMirrorHorizontalBotToTop();
    //testCollage();
    //testOtherCopy();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
