// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketPolicyRequestBuilderOps(val self: PutBucketPolicyRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): PutBucketPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  }

  final def contentMD5AsScala(value: Option[String]): PutBucketPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  }

  final def confirmRemoveSelfBucketAccessAsScala(value: Option[Boolean]): PutBucketPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.confirmRemoveSelfBucketAccess(v)
    }
  }

  final def policyAsScala(value: Option[String]): PutBucketPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.policy(v)
    }
  }

}

final class PutBucketPolicyRequestOps(val self: PutBucketPolicyRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket)

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5)

  final def confirmRemoveSelfBucketAccessAsScala: Option[Boolean] = Option(self.confirmRemoveSelfBucketAccess)

  final def policyAsScala: Option[String] = Option(self.policy)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketPolicyRequestOps {

  implicit def toPutBucketPolicyRequestBuilderOps(v: PutBucketPolicyRequest.Builder): PutBucketPolicyRequestBuilderOps =
    new PutBucketPolicyRequestBuilderOps(v)

  implicit def toPutBucketPolicyRequestOps(v: PutBucketPolicyRequest): PutBucketPolicyRequestOps =
    new PutBucketPolicyRequestOps(v)

}
