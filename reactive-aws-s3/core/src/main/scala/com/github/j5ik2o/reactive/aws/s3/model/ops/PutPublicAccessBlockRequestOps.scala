// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ PutPublicAccessBlockRequest => ScalaPutPublicAccessBlockRequest, _ }
import software.amazon.awssdk.services.s3.model.{ PutPublicAccessBlockRequest => JavaPutPublicAccessBlockRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object PutPublicAccessBlockRequestOps {

  implicit class ScalaPutPublicAccessBlockRequestOps(val self: ScalaPutPublicAccessBlockRequest) extends AnyVal {

    def toJava: JavaPutPublicAccessBlockRequest = {
      val result = JavaPutPublicAccessBlockRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))         // String
      self.contentMD5.filter(_.nonEmpty).foreach(v => result.contentMD5(v)) // String
      self.publicAccessBlockConfiguration.foreach { v =>
        import PublicAccessBlockConfigurationOps._; result.publicAccessBlockConfiguration(v.toJava)
      } // PublicAccessBlockConfiguration

      result.build()
    }

  }

}
