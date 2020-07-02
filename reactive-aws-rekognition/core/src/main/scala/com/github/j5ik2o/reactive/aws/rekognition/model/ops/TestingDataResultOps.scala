// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class TestingDataResultBuilderOps(val self: TestingDataResult.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inputAsScala(value: Option[TestingData]): TestingDataResult.Builder = {
    value.fold(self) { v => self.input(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputAsScala(value: Option[TestingData]): TestingDataResult.Builder = {
    value.fold(self) { v => self.output(v) }
  }

}

final class TestingDataResultOps(val self: TestingDataResult) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inputAsScala: Option[TestingData] = Option(self.input)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputAsScala: Option[TestingData] = Option(self.output)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTestingDataResultOps {

  implicit def toTestingDataResultBuilderOps(v: TestingDataResult.Builder): TestingDataResultBuilderOps =
    new TestingDataResultBuilderOps(v)

  implicit def toTestingDataResultOps(v: TestingDataResult): TestingDataResultOps = new TestingDataResultOps(v)

}
