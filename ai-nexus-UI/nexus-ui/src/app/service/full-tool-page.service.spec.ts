import { TestBed } from '@angular/core/testing';

import { FullToolPageService } from './full-tool-page.service';

describe('FullToolPageService', () => {
  let service: FullToolPageService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FullToolPageService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
