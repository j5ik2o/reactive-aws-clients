// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketAclResponseBuilderOps(val self: GetBucketAclResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAsScala(value: Option[Owner]): GetBucketAclResponse.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantsAsScala(value: Option[Seq[Grant]]): GetBucketAclResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.grants(v.asJava)
    }
  }

}

final class GetBucketAclResponseOps(val self: GetBucketAclResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerAsScala: Option[Owner] = Option(self.owner)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantsAsScala: Option[Seq[Grant]] = Option(self.grants).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketAclResponseOps {

  implicit def toGetBucketAclResponseBuilderOps(v: GetBucketAclResponse.Builder): GetBucketAclResponseBuilderOps =
    new GetBucketAclResponseBuilderOps(v)

  implicit def toGetBucketAclResponseOps(v: GetBucketAclResponse): GetBucketAclResponseOps =
    new GetBucketAclResponseOps(v)

}
