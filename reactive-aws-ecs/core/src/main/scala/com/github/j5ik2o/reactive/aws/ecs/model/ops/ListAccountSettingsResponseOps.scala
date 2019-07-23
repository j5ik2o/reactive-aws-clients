// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class ListAccountSettingsResponseBuilderOps(val self: ListAccountSettingsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def settingsAsScala(value: Option[Seq[Setting]]): ListAccountSettingsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.settings(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListAccountSettingsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListAccountSettingsResponseOps(val self: ListAccountSettingsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def settingsAsScala: Option[Seq[Setting]] = Option(self.settings).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListAccountSettingsResponseOps {

  implicit def toListAccountSettingsResponseBuilderOps(
      v: ListAccountSettingsResponse.Builder
  ): ListAccountSettingsResponseBuilderOps = new ListAccountSettingsResponseBuilderOps(v)

  implicit def toListAccountSettingsResponseOps(v: ListAccountSettingsResponse): ListAccountSettingsResponseOps =
    new ListAccountSettingsResponseOps(v)

}
