// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketPolicyStatusResponseBuilderOps(val self: GetBucketPolicyStatusResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def policyStatusAsScala(value: Option[PolicyStatus]): GetBucketPolicyStatusResponse.Builder = {
            value.fold(self){ v => self.policyStatus(v) }
            } 


}

final class GetBucketPolicyStatusResponseOps(val self: GetBucketPolicyStatusResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def policyStatusAsScala: Option[PolicyStatus] = Option(self.policyStatus) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketPolicyStatusResponseOps {

implicit def toGetBucketPolicyStatusResponseBuilderOps(v: GetBucketPolicyStatusResponse.Builder): GetBucketPolicyStatusResponseBuilderOps = new GetBucketPolicyStatusResponseBuilderOps(v)

implicit def toGetBucketPolicyStatusResponseOps(v: GetBucketPolicyStatusResponse): GetBucketPolicyStatusResponseOps = new GetBucketPolicyStatusResponseOps(v)

}

