// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class UntagResourceRequestBuilderOps(val self: UntagResourceRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceARNAsScala(value: Option[String]): UntagResourceRequest.Builder = {
    value.fold(self) { v => self.resourceARN(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagKeysAsScala(value: Option[Seq[String]]): UntagResourceRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagKeys(v.asJava)
    }
  }

}

final class UntagResourceRequestOps(val self: UntagResourceRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceARNAsScala: Option[String] = Option(self.resourceARN)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagKeysAsScala: Option[Seq[String]] =
    Option(self.tagKeys).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUntagResourceRequestOps {

  implicit def toUntagResourceRequestBuilderOps(v: UntagResourceRequest.Builder): UntagResourceRequestBuilderOps =
    new UntagResourceRequestBuilderOps(v)

  implicit def toUntagResourceRequestOps(v: UntagResourceRequest): UntagResourceRequestOps =
    new UntagResourceRequestOps(v)

}
