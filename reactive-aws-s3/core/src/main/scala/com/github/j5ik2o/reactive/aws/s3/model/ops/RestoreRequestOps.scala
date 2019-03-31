// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ RestoreRequest => ScalaRestoreRequest, _ }
import software.amazon.awssdk.services.s3.model.{ RestoreRequest => JavaRestoreRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object RestoreRequestOps {

  implicit class ScalaRestoreRequestOps(val self: ScalaRestoreRequest) extends AnyVal {

    def toJava: JavaRestoreRequest = {
      val result = JavaRestoreRequest.builder()
      self.days.map(_.intValue).foreach(v => result.days(v)) // Int
      self.glacierJobParameters.foreach { v =>
        import GlacierJobParametersOps._; result.glacierJobParameters(v.toJava)
      } // GlacierJobParameters
      self.`type`.foreach { v =>
        import RestoreRequestTypeOps._; result.`type`(v.toJava)
      } // String
      self.tier.foreach { v =>
        import TierOps._; result.tier(v.toJava)
      } // String
      self.description.filter(_.nonEmpty).foreach(v => result.description(v)) // String
      self.selectParameters.foreach { v =>
        import SelectParametersOps._; result.selectParameters(v.toJava)
      } // SelectParameters
      self.outputLocation.foreach { v =>
        import OutputLocationOps._; result.outputLocation(v.toJava)
      } // OutputLocation

      result.build()
    }

  }

}
