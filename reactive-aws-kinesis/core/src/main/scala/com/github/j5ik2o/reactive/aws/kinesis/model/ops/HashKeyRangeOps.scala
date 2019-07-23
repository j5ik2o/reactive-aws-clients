// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class HashKeyRangeBuilderOps(val self: HashKeyRange.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startingHashKeyAsScala(value: Option[String]): HashKeyRange.Builder = {
    value.fold(self) { v =>
      self.startingHashKey(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endingHashKeyAsScala(value: Option[String]): HashKeyRange.Builder = {
    value.fold(self) { v =>
      self.endingHashKey(v)
    }
  }

}

final class HashKeyRangeOps(val self: HashKeyRange) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startingHashKeyAsScala: Option[String] = Option(self.startingHashKey)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endingHashKeyAsScala: Option[String] = Option(self.endingHashKey)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHashKeyRangeOps {

  implicit def toHashKeyRangeBuilderOps(v: HashKeyRange.Builder): HashKeyRangeBuilderOps = new HashKeyRangeBuilderOps(v)

  implicit def toHashKeyRangeOps(v: HashKeyRange): HashKeyRangeOps = new HashKeyRangeOps(v)

}
