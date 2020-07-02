// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class TestingDataBuilderOps(val self: TestingData.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def assetsAsScala(value: Option[Seq[Asset]]): TestingData.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.assets(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoCreateAsScala(value: Option[Boolean]): TestingData.Builder = {
    value.fold(self) { v => self.autoCreate(v) }
  }

}

final class TestingDataOps(val self: TestingData) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def assetsAsScala: Option[Seq[Asset]] =
    Option(self.assets).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoCreateAsScala: Option[Boolean] = Option(self.autoCreate)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTestingDataOps {

  implicit def toTestingDataBuilderOps(v: TestingData.Builder): TestingDataBuilderOps = new TestingDataBuilderOps(v)

  implicit def toTestingDataOps(v: TestingData): TestingDataOps = new TestingDataOps(v)

}
