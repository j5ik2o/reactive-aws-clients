// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DescribeTasksRequestBuilderOps(val self: DescribeTasksRequest.Builder) extends AnyVal {

  final def clusterAsScala(value: Option[String]): DescribeTasksRequest.Builder = {
    value.fold(self) { v =>
      self.cluster(v)
    }
  }

  final def tasksAsScala(value: Option[Seq[String]]): DescribeTasksRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tasks(v.asJava)
    }
  }

  final def includeAsScala(value: Option[Seq[TaskField]]): DescribeTasksRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.include(v.asJava)
    }
  }

}

final class DescribeTasksRequestOps(val self: DescribeTasksRequest) extends AnyVal {

  final def clusterAsScala: Option[String] = Option(self.cluster)

  final def tasksAsScala: Option[Seq[String]] = Option(self.tasks).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def includeAsScala: Option[Seq[TaskField]] = Option(self.include).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTasksRequestOps {

  implicit def toDescribeTasksRequestBuilderOps(v: DescribeTasksRequest.Builder): DescribeTasksRequestBuilderOps =
    new DescribeTasksRequestBuilderOps(v)

  implicit def toDescribeTasksRequestOps(v: DescribeTasksRequest): DescribeTasksRequestOps =
    new DescribeTasksRequestOps(v)

}
