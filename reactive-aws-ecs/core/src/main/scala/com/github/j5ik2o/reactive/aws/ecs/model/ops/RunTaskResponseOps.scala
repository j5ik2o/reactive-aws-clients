// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class RunTaskResponseBuilderOps(val self: RunTaskResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tasksAsScala(value: Option[Seq[Task]]): RunTaskResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tasks(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def failuresAsScala(value: Option[Seq[Failure]]): RunTaskResponse.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.failures(v.asJava) } 
            }


}

final class RunTaskResponseOps(val self: RunTaskResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tasksAsScala: Option[Seq[Task]] = Option(self.tasks).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def failuresAsScala: Option[Seq[Failure]] = Option(self.failures).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRunTaskResponseOps {

implicit def toRunTaskResponseBuilderOps(v: RunTaskResponse.Builder): RunTaskResponseBuilderOps = new RunTaskResponseBuilderOps(v)

implicit def toRunTaskResponseOps(v: RunTaskResponse): RunTaskResponseOps = new RunTaskResponseOps(v)

}

