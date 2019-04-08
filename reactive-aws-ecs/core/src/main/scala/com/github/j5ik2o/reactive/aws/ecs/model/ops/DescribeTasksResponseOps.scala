// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DescribeTasksResponseBuilderOps(val self: DescribeTasksResponse.Builder) extends AnyVal {

  final def tasksAsScala(value: Option[Seq[Task]]): DescribeTasksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tasks(v.asJava)
    }
  }

  final def failuresAsScala(value: Option[Seq[Failure]]): DescribeTasksResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.failures(v.asJava)
    }
  }

}

final class DescribeTasksResponseOps(val self: DescribeTasksResponse) extends AnyVal {

  final def tasksAsScala: Option[Seq[Task]] = Option(self.tasks).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def failuresAsScala: Option[Seq[Failure]] = Option(self.failures).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTasksResponseOps {

  implicit def toDescribeTasksResponseBuilderOps(v: DescribeTasksResponse.Builder): DescribeTasksResponseBuilderOps =
    new DescribeTasksResponseBuilderOps(v)

  implicit def toDescribeTasksResponseOps(v: DescribeTasksResponse): DescribeTasksResponseOps =
    new DescribeTasksResponseOps(v)

}
