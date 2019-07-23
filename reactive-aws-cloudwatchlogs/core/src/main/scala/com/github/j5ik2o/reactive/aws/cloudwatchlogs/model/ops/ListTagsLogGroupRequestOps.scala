// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class ListTagsLogGroupRequestBuilderOps(val self: ListTagsLogGroupRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): ListTagsLogGroupRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

}

final class ListTagsLogGroupRequestOps(val self: ListTagsLogGroupRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTagsLogGroupRequestOps {

  implicit def toListTagsLogGroupRequestBuilderOps(
      v: ListTagsLogGroupRequest.Builder
  ): ListTagsLogGroupRequestBuilderOps = new ListTagsLogGroupRequestBuilderOps(v)

  implicit def toListTagsLogGroupRequestOps(v: ListTagsLogGroupRequest): ListTagsLogGroupRequestOps =
    new ListTagsLogGroupRequestOps(v)

}
