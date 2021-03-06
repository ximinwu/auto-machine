package tk.gbl.game.dandantang.bean;

/**
 * Date: 2015/8/1
 * Time: 16:51
 *
 * @author Tian.Dong
 */
public class SelfInfo {

  /**
   * 角度
   */
  Integer angle;

  /**
   * 力量
   */
  double power = 0.0;


  double originalPower = 0.0;

  /**
   * 0 left
   * 1 right
   */
  Integer leftOrRight;


  public Integer getAngle() {
    return angle;
  }

  public void setAngle(Integer angle) {
    this.angle = angle;
  }

  public double getPower() {
    return power;
  }

  public void setPower(double power) {
    this.power = power;
  }

  public Integer getLeftOrRight() {
    return leftOrRight;
  }

  public void setLeftOrRight(Integer leftOrRight) {
    this.leftOrRight = leftOrRight;
  }

  public double getOriginalPower() {
    return originalPower;
  }

  public void setOriginalPower(double originalPower) {
    this.originalPower = originalPower;
  }

  @Override
  public String toString() {
    return "SelfInfo{" +
        "angle=" + angle +
        ", power=" + power +
        ", originalPower=" + originalPower +
        ", leftOrRight=" + leftOrRight +
        '}';
  }
}
