# 키친포스

## 요구사항

### 상품 (Product)

#### create()
- [x] 상품을 등록할 수 있다.
- [x] 상품의 가격이 올바르지 않으면 등록할 수 없다.
  - [x] 상품의 가격은 0원 이상이어야 한다.
#### list()
- [x] 상품의 목록을 조회할 수 있다.

<br/>

### 메뉴 그룹 (Menu Group)

#### create()
- [x] 메뉴 그룹을 등록할 수 있다.
#### list()
- [x] 메뉴 그룹의 목록을 조회할 수 있다.

<br/>

### 메뉴 (Menu)

#### create()
- [ ] 메뉴를 등록할 수 있다.
- [ ] 메뉴의 가격이 올바르지 않으면 등록할 수 없다.
  - [ ] 메뉴의 가격은 0원 이상이어야 한다.
- [ ] 메뉴의 메뉴 그룹이 존재하지 않으면 등록할 수 없다.
- [ ] 메뉴의 메뉴 상품이 존재하지 않으면 등록할 수 없다.
- [ ] 메뉴의 수량이 올바르지 않으면 등록할 수 없다.
  - [ ] 메뉴의 수량은 1개 이상이어야 한다.
#### list()
- [ ] 메뉴의 목록을 조회할 수 있다.

<br/>

### 주문 (Order)

#### create()
- [ ] 주문을 등록할 수 있다.
- [ ] 주문의 주문 항목이 존재하지 않으면 등록할 수 없다.
- [ ] 주문의 주문 항목에 메뉴가 하나라도 적혀있지 않으면 등록할 수 없다.
- [ ] 주문의 주문 테이블이 존재하지 않으면 등록할 수 없다.
- [ ] 주문의 주문 테이블이 비어 있으면(손님이 없으면) 등록할 수 없다.
#### list()
- [ ] 주문의 목록을 조회할 수 있다.
#### changeOrderStatus()
- [ ] 주문 상태를 변경할 수 있다.
- [ ] 주문 상태는 주문이 존재하지 않으면 변경할 수 없다.
- [ ] 주문 상태가 `계산 완료`면 변경할 수 없다.

<br/>

### 단체 지정 (Table Group)

#### create()
- [ ] 단체를 등록할 수 있다.
- [ ] 단체 지정 시 주문 테이블의 개수가 올바르지 않으면 등록할 수 없다.
  - [ ] 단체 지정 시 주문 테이블의 개수는 2개 이상이어야 한다.
- [ ] 단체 지정 시 주문 테이블이 하나라도 존재하지 않으면 등록할 수 없다.
- [ ] 단체 지정 시 이미 그룹화된 테이블이 하나라도 속해 있으면 등록할 수 없다.
#### ungroup()
- [ ] 단체를 삭제할 수 있다.
- [ ] 단체 해제 시 주문 상태가 `조리` 또는 `식사`면 삭제할 수 없다.

<br/>

### 테이블 (Table)

#### create()
- [ ] 테이블을 등록할 수 있다.
#### list()
- [ ] 테이블의 목록을 조회할 수 있다.
#### changeEmpty()
- [ ] 테이블 상태를 빈 테이블로 변경할 수 있다.
- [ ] 테이블 상태는 주문 테이블이 존재하지 않으면 변경할 수 없다.
- [ ] 테이블 상태는 주문 테이블의 단체 지정이 존재하지 않으면 변경할 수 없다.
- [ ] 테이블 상태는 주문 상태가 `조리` 또는 `식사`면 변경할 수 없다.
#### changeNumberOfGuests()
- [ ] 테이블에 방문한 손님수를 변경할 수 있다.
- [ ] 테이블에 방문한 손님수가 올바르지 않으면 변경할 수 없다.
  - [ ] 테이블에 방문한 손님수는 0명 이상이어야 한다.
- [ ] 테이블에 방문한 손님수는 주문 테이블이 존재하지 않으면 변경할 수 없다.
- [ ] 테이블에 방문한 손님수는 주문 테이블이 비어 있으면(손님이 없으면) 변경할 수 없다.

<br/>

## 용어 사전

| 한글명 | 영문명 | 설명 |
| --- | --- | --- |
| 상품 | product | 메뉴를 관리하는 기준이 되는 데이터 |
| 메뉴 그룹 | menu group | 메뉴 묶음, 분류 |
| 메뉴 | menu | 메뉴 그룹에 속하는 실제 주문 가능 단위 |
| 메뉴 상품 | menu product | 메뉴에 속하는 수량이 있는 상품 |
| 금액 | amount | 가격 * 수량 |
| 주문 테이블 | order table | 매장에서 주문이 발생하는 영역 |
| 빈 테이블 | empty table | 주문을 등록할 수 없는 주문 테이블 |
| 주문 | order | 매장에서 발생하는 주문 |
| 주문 상태 | order status | 주문은 조리 ➜ 식사 ➜ 계산 완료 순서로 진행된다. |
| 방문한 손님 수 | number of guests | 필수 사항은 아니며 주문은 0명으로 등록할 수 있다. |
| 단체 지정 | table group | 통합 계산을 위해 개별 주문 테이블을 그룹화하는 기능 |
| 주문 항목 | order line item | 주문에 속하는 수량이 있는 메뉴 |
| 매장 식사 | eat in | 포장하지 않고 매장에서 식사하는 것 |
