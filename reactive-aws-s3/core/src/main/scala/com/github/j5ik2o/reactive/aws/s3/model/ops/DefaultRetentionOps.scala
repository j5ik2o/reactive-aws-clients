// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ DefaultRetention => ScalaDefaultRetention, _ }
import software.amazon.awssdk.services.s3.model.{ DefaultRetention => JavaDefaultRetention }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object DefaultRetentionOps {

  implicit class ScalaDefaultRetentionOps(val self: ScalaDefaultRetention) extends AnyVal {

    def toJava: JavaDefaultRetention = {
      val result = JavaDefaultRetention.builder()
      self.mode.foreach { v =>
        import ObjectLockRetentionModeOps._; result.mode(v.toJava)
      } // String
      self.days.map(_.intValue).foreach(v => result.days(v))   // Int
      self.years.map(_.intValue).foreach(v => result.years(v)) // Int

      result.build()
    }

  }

  implicit class JavaDefaultRetentionOps(val self: JavaDefaultRetention) extends AnyVal {

    def toScala: ScalaDefaultRetention = {
      ScalaDefaultRetention()
        .withMode(Option(self.mode).map { v =>
          import ObjectLockRetentionModeOps._; v.toScala
        }) // String
        .withDays(Option(self.days).map(_.intValue)) // Int
        .withYears(Option(self.years).map(_.intValue)) // Int
    }

  }

}
