// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class StartTaskResponseBuilderOps(val self: StartTaskResponse.Builder) extends AnyVal {

  final def tasksAsScala(value: Option[Seq[Task]]): StartTaskResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tasks(v.asJava)
    }
  }

  final def failuresAsScala(value: Option[Seq[Failure]]): StartTaskResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.failures(v.asJava)
    }
  }

}

final class StartTaskResponseOps(val self: StartTaskResponse) extends AnyVal {

  final def tasksAsScala: Option[Seq[Task]] = Option(self.tasks).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def failuresAsScala: Option[Seq[Failure]] = Option(self.failures).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartTaskResponseOps {

  implicit def toStartTaskResponseBuilderOps(v: StartTaskResponse.Builder): StartTaskResponseBuilderOps =
    new StartTaskResponseBuilderOps(v)

  implicit def toStartTaskResponseOps(v: StartTaskResponse): StartTaskResponseOps = new StartTaskResponseOps(v)

}
