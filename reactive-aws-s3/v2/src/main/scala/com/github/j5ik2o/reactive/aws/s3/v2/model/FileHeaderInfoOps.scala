// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ FileHeaderInfo => ScalaFileHeaderInfo, _ }
import software.amazon.awssdk.services.s3.model.{ FileHeaderInfo => JavaFileHeaderInfo }

object FileHeaderInfoOps {

  implicit class ScalaFileHeaderInfoOps(val self: ScalaFileHeaderInfo) extends AnyVal {

    def toJava: JavaFileHeaderInfo = {
      JavaFileHeaderInfo.valueOf(self.entryName)
    }

  }

  implicit class JavaFileHeaderInfoOps(val self: JavaFileHeaderInfo) extends AnyVal {

    def toScala: ScalaFileHeaderInfo = {
      ScalaFileHeaderInfo.withName(self.toString)
    }

  }

}
