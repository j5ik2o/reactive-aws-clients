package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ TransactWriteItem => ScalaTransactWriteItem, _ }
import software.amazon.awssdk.services.dynamodb.model.{ TransactWriteItem => JavaTransactWriteItem }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object TransactWriteItemOps {

  implicit class ScalaTransactWriteItemOps(val self: ScalaTransactWriteItem) extends AnyVal {

    def toJava: JavaTransactWriteItem = {
      val result = JavaTransactWriteItem.builder()
      self.conditionCheck.foreach { v =>
        result.conditionCheck(v.toJava)
      } // ConditionCheck, case Other
      self.put.foreach { v =>
        import PutOps._; result.put(v.toJava)
      } // Put, case Other
      self.delete.foreach { v =>
        import DeleteOps._; result.delete(v.toJava)
      } // Delete, case Other
      self.update.foreach { v =>
        import UpdateOps._; result.update(v.toJava)
      } // Update, case Other

      result.build()
    }

  }

  implicit class JavaTransactWriteItemOps(val self: JavaTransactWriteItem) extends AnyVal {

    def toScala: ScalaTransactWriteItem = {
      ScalaTransactWriteItem()
        .withConditionCheck(Option(self.conditionCheck).map { v =>
          v.toScala
        }) // ConditionCheck, Map-12
        .withPut(Option(self.put).map { v =>
          import PutOps._; v.toScala
        }) // Put, Map-12
        .withDelete(Option(self.delete).map { v =>
          import DeleteOps._; v.toScala
        }) // Delete, Map-12
        .withUpdate(Option(self.update).map { v =>
          import UpdateOps._; v.toScala
        }) // Update, Map-12
    }

  }

}
