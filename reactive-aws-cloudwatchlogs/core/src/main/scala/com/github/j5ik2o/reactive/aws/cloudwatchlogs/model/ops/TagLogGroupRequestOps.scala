// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class TagLogGroupRequestBuilderOps(val self: TagLogGroupRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): TagLogGroupRequest.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Map[String, String]]): TagLogGroupRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class TagLogGroupRequestOps(val self: TagLogGroupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Map[String, String]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTagLogGroupRequestOps {

  implicit def toTagLogGroupRequestBuilderOps(v: TagLogGroupRequest.Builder): TagLogGroupRequestBuilderOps =
    new TagLogGroupRequestBuilderOps(v)

  implicit def toTagLogGroupRequestOps(v: TagLogGroupRequest): TagLogGroupRequestOps = new TagLogGroupRequestOps(v)

}
