// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{
  ListBucketInventoryConfigurationsRequest => ScalaListBucketInventoryConfigurationsRequest,
  _
}
import software.amazon.awssdk.services.s3.model.{
  ListBucketInventoryConfigurationsRequest => JavaListBucketInventoryConfigurationsRequest
}

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object ListBucketInventoryConfigurationsRequestOps {

  implicit class ScalaListBucketInventoryConfigurationsRequestOps(
      val self: ScalaListBucketInventoryConfigurationsRequest
  ) extends AnyVal {

    def toJava: JavaListBucketInventoryConfigurationsRequest = {
      val result = JavaListBucketInventoryConfigurationsRequest.builder()
      self.bucket.filter(_.nonEmpty).foreach(v => result.bucket(v))                       // String
      self.continuationToken.filter(_.nonEmpty).foreach(v => result.continuationToken(v)) // String

      result.build()
    }

  }

}
