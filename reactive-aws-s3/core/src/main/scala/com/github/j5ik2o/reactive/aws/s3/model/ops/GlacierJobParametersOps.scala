// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ GlacierJobParameters => ScalaGlacierJobParameters, _ }
import software.amazon.awssdk.services.s3.model.{ GlacierJobParameters => JavaGlacierJobParameters }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GlacierJobParametersOps {

  implicit class ScalaGlacierJobParametersOps(val self: ScalaGlacierJobParameters) extends AnyVal {

    def toJava: JavaGlacierJobParameters = {
      val result = JavaGlacierJobParameters.builder()
      self.tier.foreach { v =>
        import TierOps._; result.tier(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaGlacierJobParametersOps(val self: JavaGlacierJobParameters) extends AnyVal {

    def toScala: ScalaGlacierJobParameters = {
      ScalaGlacierJobParameters()
        .withTier(Option(self.tier).map { v =>
          import TierOps._; v.toScala
        }) // String
    }

  }

}
