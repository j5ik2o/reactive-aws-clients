// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTagsRequestBuilderOps(val self: CreateTagsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourcesAsScala(value: Option[Seq[String]]): CreateTagsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resources(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): CreateTagsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class CreateTagsRequestOps(val self: CreateTagsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourcesAsScala: Option[Seq[String]] =
    Option(self.resources).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTagsRequestOps {

  implicit def toCreateTagsRequestBuilderOps(v: CreateTagsRequest.Builder): CreateTagsRequestBuilderOps =
    new CreateTagsRequestBuilderOps(v)

  implicit def toCreateTagsRequestOps(v: CreateTagsRequest): CreateTagsRequestOps = new CreateTagsRequestOps(v)

}
