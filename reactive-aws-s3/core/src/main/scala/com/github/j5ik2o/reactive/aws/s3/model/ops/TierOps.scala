// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ Tier => ScalaTier, _ }
import software.amazon.awssdk.services.s3.model.{ Tier => JavaTier }

object TierOps {

  implicit class ScalaTierOps(val self: ScalaTier) extends AnyVal {

    def toJava: JavaTier = {
      JavaTier.valueOf(self.entryName)
    }

  }

  implicit class JavaTierOps(val self: JavaTier) extends AnyVal {

    def toScala: ScalaTier = {
      ScalaTier.withName(self.toString)
    }

  }

}
