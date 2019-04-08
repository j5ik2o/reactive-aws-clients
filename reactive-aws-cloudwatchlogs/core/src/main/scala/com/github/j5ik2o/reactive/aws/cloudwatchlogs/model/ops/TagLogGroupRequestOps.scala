// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class TagLogGroupRequestBuilderOps(val self: TagLogGroupRequest.Builder) extends AnyVal {

  final def logGroupNameAsScala(value: Option[String]): TagLogGroupRequest.Builder = {
    value.fold(self) { v =>
      self.logGroupName(v)
    }
  } // String

  final def tagsAsScala(value: Option[Map[String, String]]): TagLogGroupRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Map[String, String]
  }

}

final class TagLogGroupRequestOps(val self: TagLogGroupRequest) extends AnyVal {

  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName) // String

  final def tagsAsScala: Option[Map[String, String]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  } // Map[String, String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTagLogGroupRequestOps {

  implicit def toTagLogGroupRequestBuilderOps(v: TagLogGroupRequest.Builder): TagLogGroupRequestBuilderOps =
    new TagLogGroupRequestBuilderOps(v)

  implicit def toTagLogGroupRequestOps(v: TagLogGroupRequest): TagLogGroupRequestOps = new TagLogGroupRequestOps(v)

}
