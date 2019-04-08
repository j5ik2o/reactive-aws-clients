// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class UntagLogGroupRequestBuilderOps(val self: UntagLogGroupRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): UntagLogGroupRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[String]]): UntagLogGroupRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class UntagLogGroupRequestOps(val self: UntagLogGroupRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  final def tagsAsScala: Option[Seq[String]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUntagLogGroupRequestOps {

  implicit def toUntagLogGroupRequestBuilderOps(v: UntagLogGroupRequest.Builder): UntagLogGroupRequestBuilderOps =
    new UntagLogGroupRequestBuilderOps(v)

  implicit def toUntagLogGroupRequestOps(v: UntagLogGroupRequest): UntagLogGroupRequestOps =
    new UntagLogGroupRequestOps(v)

}
