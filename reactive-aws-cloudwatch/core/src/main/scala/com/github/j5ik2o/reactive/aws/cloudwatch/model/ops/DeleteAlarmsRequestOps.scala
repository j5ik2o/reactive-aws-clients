// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DeleteAlarmsRequestBuilderOps(val self: DeleteAlarmsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmNamesAsScala(value: Option[Seq[String]]): DeleteAlarmsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.alarmNames(v.asJava)
    }
  }

}

final class DeleteAlarmsRequestOps(val self: DeleteAlarmsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmNamesAsScala: Option[Seq[String]] =
    Option(self.alarmNames).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteAlarmsRequestOps {

  implicit def toDeleteAlarmsRequestBuilderOps(v: DeleteAlarmsRequest.Builder): DeleteAlarmsRequestBuilderOps =
    new DeleteAlarmsRequestBuilderOps(v)

  implicit def toDeleteAlarmsRequestOps(v: DeleteAlarmsRequest): DeleteAlarmsRequestOps = new DeleteAlarmsRequestOps(v)

}
