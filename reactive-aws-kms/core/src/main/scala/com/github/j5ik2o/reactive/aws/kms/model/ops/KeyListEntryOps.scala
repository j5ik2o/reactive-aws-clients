// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class KeyListEntryBuilderOps(val self: KeyListEntry.Builder) extends AnyVal {

  final def keyIdAsScala(value: Option[String]): KeyListEntry.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  final def keyArnAsScala(value: Option[String]): KeyListEntry.Builder = {
    value.fold(self) { v =>
      self.keyArn(v)
    }
  }

}

final class KeyListEntryOps(val self: KeyListEntry) extends AnyVal {

  final def keyIdAsScala: Option[String] = Option(self.keyId)

  final def keyArnAsScala: Option[String] = Option(self.keyArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToKeyListEntryOps {

  implicit def toKeyListEntryBuilderOps(v: KeyListEntry.Builder): KeyListEntryBuilderOps = new KeyListEntryBuilderOps(v)

  implicit def toKeyListEntryOps(v: KeyListEntry): KeyListEntryOps = new KeyListEntryOps(v)

}
