// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ ListBucketsRequest => ScalaListBucketsRequest, _ }
import software.amazon.awssdk.services.s3.model.{ ListBucketsRequest => JavaListBucketsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListBucketsRequestOps {

  implicit class ScalaListBucketsRequestOps(val self: ScalaListBucketsRequest) extends AnyVal {

    def toJava: JavaListBucketsRequest = {
      val result = JavaListBucketsRequest.builder()

      result.build()
    }

  }

}
