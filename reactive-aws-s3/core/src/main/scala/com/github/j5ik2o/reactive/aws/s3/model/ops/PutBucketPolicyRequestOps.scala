// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutBucketPolicyRequestBuilderOps(val self: PutBucketPolicyRequest.Builder) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): PutBucketPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withContentMD5AsScala(value: Option[String]): PutBucketPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.contentMD5(v)
    }
  } // String

  final def withConfirmRemoveSelfBucketAccessAsScala(value: Option[Boolean]): PutBucketPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.confirmRemoveSelfBucketAccess(v)
    }
  } // Boolean

  final def withPolicyAsScala(value: Option[String]): PutBucketPolicyRequest.Builder = {
    value.fold(self) { v =>
      self.policy(v)
    }
  } // String

}

final class PutBucketPolicyRequestOps(val self: PutBucketPolicyRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def contentMD5AsScala: Option[String] = Option(self.contentMD5) // String

  final def confirmRemoveSelfBucketAccessAsScala: Option[Boolean] =
    Option(self.confirmRemoveSelfBucketAccess) // Boolean

  final def policyAsScala: Option[String] = Option(self.policy) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutBucketPolicyRequestOps {

  implicit def toPutBucketPolicyRequestBuilderOps(v: PutBucketPolicyRequest.Builder): PutBucketPolicyRequestBuilderOps =
    new PutBucketPolicyRequestBuilderOps(v)

  implicit def toPutBucketPolicyRequestOps(v: PutBucketPolicyRequest): PutBucketPolicyRequestOps =
    new PutBucketPolicyRequestOps(v)

}
