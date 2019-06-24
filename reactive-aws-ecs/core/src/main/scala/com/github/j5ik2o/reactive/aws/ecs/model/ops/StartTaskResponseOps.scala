// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class StartTaskResponseBuilderOps(val self: StartTaskResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tasksAsScala(value: Option[Seq[Task]]): StartTaskResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tasks(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala(value: Option[Seq[Failure]]): StartTaskResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failures(v.asJava)
    }
  }

}

final class StartTaskResponseOps(val self: StartTaskResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tasksAsScala: Option[Seq[Task]] = Option(self.tasks).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failuresAsScala: Option[Seq[Failure]] = Option(self.failures).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartTaskResponseOps {

  implicit def toStartTaskResponseBuilderOps(v: StartTaskResponse.Builder): StartTaskResponseBuilderOps =
    new StartTaskResponseBuilderOps(v)

  implicit def toStartTaskResponseOps(v: StartTaskResponse): StartTaskResponseOps = new StartTaskResponseOps(v)

}
