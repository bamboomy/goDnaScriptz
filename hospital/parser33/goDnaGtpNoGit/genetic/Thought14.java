package genetic;
import java.util.ArrayList;
class Thought14 extends Thought{
private static ArrayList<Thought14> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 596.2305028294783;
private double fd1 = 907.8806242857016;
private Thought fo0 = null;
private Thought fo1 = null;
Thought14 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought14 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought14 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought14 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought14 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought14 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought14 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought14 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought14 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought14 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought14 instance = new Thought14 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[4][7] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    lb0 = fb0 || fb1;
    fd1 = fd0 + fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    Output.points[4][8] -= fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought279.getInstance();
    ab1 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Output.points[5][0] -= fd0;
    fd1 = fd0 - fd1;
    fb1 = !ab1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought65.getInstance(fo1, fo0, fo1, fo0);
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb1 = false;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
    Output.points[5][1] -= ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb1, lb2);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[5][2] += fd1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
    ad2 = ad3 - ad4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab2 = fo1.m2(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    if (ab3) {
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
    Thought lo0 = Thought233.getInstance();
if(ao3 != null){
          ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fd0 *= -1;
    fb0 = fd1 > fd0;
    fb1 = lb1 && fb0;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao4.m3(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
    fd0 = fd1 + fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    Output.points[5][3] -= ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought319.getInstance(ao1, ao2, ao3, ao4);
    fb0 = !fb1;
    double ld1 = 417.9946640663754;
    fd0 = fd1 + ld1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
    fd1 = ld1 - ad1;
    ad2 = ad3 + ad4;
    lb2 = !fb0;
    boolean lb3 = false;
    fb0 = fd0 < fd1;
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3);
}
if(ao1 != null){
      ao1.m1();
}
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb2, lb3);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought177.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    double ld1 = 754.8284290593581;
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb2, ab1);
}
    fd1 = ld1 - fd0;
    double ld3 = 336.8129885648303;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld4 = 193.44983738548902;
    ab2 = !ab3;
if(ao2 != null){
      ab4 = ao2.m2(ld4, fd0, fd1, ld1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ld3, ld4, fd0, fd1);
}
    fb1 = !lb2;
    ld1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ld3 = ld4 - fd0;
if(ao4 != null){
      fd1 = ao4.m3(ab1, ab2, ab3, ab4);
}
    fb0 = ld1 < ld3;
    Thought lo5 = Thought214.getInstance(fo0, fo1, ao1, ao2, ld4, fd0, fd1, ld1, fb1, lb2, ab1, ab2);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[5][4] += ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fd0 *= -1;
    boolean lb0 = true;
    double ld1 = 996.1186958827144;
    Output.points[5][5] += fd0;
    fd1 = ld1 - ad1;
    ab1 = !ab2;
    double ld2 = 32.192960958840516;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ab3 = ld1 > ld2;
    ad1 = ad2 - ad3;
    Output.points[5][6] += ad4;
if(fo0 != null){
      fd0 = fo0.m3(ab4, fb0, fb1, lb0);
}
    Output.points[5][7] += fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fb1 = !fb0;
    fb1 = fd0 > fd1;
    boolean lb0 = true;
    lb0 = fd0 < fd1;
    double ld1 = 425.2218327808423;
    if (fb0) {
        Thought lo2 = Thought356.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
        if (lb0) {
            fd0 = fd1 - ld1;
if(fo1 != null){
              fo1.m2(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
            Output.points[5][8] -= fd1;
            boolean lb3 = false;
}}
Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
    Output.points[6][0] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    lb1 = fd1 < fd0;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb3 = true;
if(fo1 != null){
      fd1 = fo1.m3(lb2, lb3, ab1, ab2);
}
    double ld4 = 160.2311545521963;

Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought338.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    Output.points[6][1] -= fd0;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld0 = 1.7263547337827492;
    ab4 = fd0 > fd1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3);
}
    ab4 = fb0 && fb1;
    lb1 = ad4 > fd0;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
    ab4 = ad3 > ad4;
if(fo1 != null){
      fo1.m3();
}
    fd0 = fd1 - ld0;
    fb0 = ad1 > ad2;
if(fo0 != null){
      fb1 = fo0.m2(lb1, ab1, ab2, ab3);
}
    if (ab4) {
        fb0 = ad3 < ad4;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, lb1, ab1, ab2, ab3);
}
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    Output.points[6][2] += fd0;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    boolean lb0 = false;
    Output.points[6][3] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    lb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    lb1 = fb0 && fb1;
        double ld2 = 317.6237563674893;
    if (lb0) {
        fd0 *= -1;
        fd1 = ld2 - fd0;
if(ao3 != null){
          fd1 = ao3.m3();
}
        lb1 = fb0 || fb1;
if(fo0 != null){
          ao4 = fo0.m4(lb0, lb1, fb0, fb1);
}
        ld2 = fd0 - fd1;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld2, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld2, fd0, lb0, lb1, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought317.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb2 = false;
    lb0 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
    double ld3 = 388.7446378754379;
    double ld4 = 803.0907834492484;
    boolean lb5 = true;
    ad4 = fd0 + fd1;
    Thought lo6 = Thought197.getInstance(ao1, ao2, ao3, ao4, ld3, ld4, ad1, ad2);
    boolean lb7 = false;
if(fo0 != null){
      fo0.m3();
}
    double ld8 = 558.4634435405912;
    lb7 = ad2 > ad3;
    Thought lo9 = Thought93.getInstance(fb0, fb1, lb0, lb2);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld3, lb5, lb7, fb0, fb1);
}
if(fo1 != null){
      ld4 = fo1.m3(ld8, ad1, ad2, ad3, lb0, lb2, lb5, lb7);
}
    ad4 *= -1;
    fd0 *= -1;
    Output.points[6][4] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ld3 = fo1.m3(ld4, ld8, ad1, ad2);
}
    double ld10 = 813.0428225648097;

Thought.STACK_COUNTER++;
return lb5;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
    Output.points[6][5] -= fd1;
if(ao1 != null){
      fd0 = ao1.m3();
}
    ab3 = ab4 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
    boolean lb0 = true;
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
        double ld1 = 985.1455503468845;
    fd0 = fd1 - ld1;

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    double ld0 = 191.53980809491574;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ab3 = ao3.m2(ad3, ad4, fd0, fd1);
}
    boolean lb1 = true;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3);
}
    Output.points[6][6] -= ad4;
if(ao4 != null){
      ab3 = ao4.m2();
}

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    Output.points[6][7] -= fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    double ld0 = 865.6927962358642;
if(fo0 != null){
      fb1 = fo0.m2(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought131.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fd0 = fd1 - ld0;
    Output.points[6][8] -= fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought399.getInstance(fd1, ld0, fd0, fd1);
    fb1 = fb0 || fb1;
    double ld3 = 298.1368974753854;
    boolean lb4 = true;
    for(int i0=0; i0<10; i0++){
        Thought lo5 = Thought51.getInstance(fo0, fo1, fo0, fo1, ld0, ld3, fd0, fd1);
        lb4 = ld0 < ld3;
if(fo0 != null){
          fo0.m2();
}
if(fo1 != null){
          fo1.m3(fb0, fb1, lb4, fb0);
}
        double ld6 = 521.1328885956513;
        fb1 = ld3 < fd0;
        double ld7 = 308.19007454925975;
        lb4 = fb0 || fb1;
if(fo0 != null){
          lb4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld6, ld7, fb0, fb1, lb4, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(ld0, ld3, fd0, fd1, lb4, fb0, fb1, lb4);
}
        fb0 = fb1 || lb4;
        Thought lo8 = Thought57.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb4, fb0);
}
Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    Thought lo0 = Thought114.getInstance(fo0, fo1, fo0, fo1);
    Thought lo1 = Thought344.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    Thought lo2 = Thought373.getInstance();
if(fo1 != null){
      fb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought376.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    Thought lo4 = Thought262.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    Thought lo5 = Thought394.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = !fb1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m3();
}
    double ld0 = 767.1702246395566;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
    Output.points[7][0] += ad4;
    Thought lo1 = Thought141.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
    Thought lo2 = Thought277.getInstance();
    Thought lo3 = Thought362.getInstance(fb1, fb0, fb1, fb0);
    fb1 = ad3 < ad4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 + ad1;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    boolean lb4 = false;
    Thought lo5 = Thought186.getInstance(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb4);

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought313.getInstance(fd0, fd1, ad1, ad2);
    ab2 = !ab3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab4 = ad1 < ad2;
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m2();
}
    fb0 = ad3 > ad4;
    fd0 *= -1;
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fd1 = ad1 - ad2;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
        ab1 = !ab2;
        ad1 *= -1;
        double ld1 = 475.32297640344217;
        boolean lb2 = false;
        Output.points[7][1] -= ad1;
        Output.points[7][2] += ad2;
if(fo0 != null){
          fo0.m1(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        ld1 *= -1;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb2, ab1, ab2);
}
        Output.points[7][3] += ad2;
}
Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
    lb0 = !fb0;
    Thought lo1 = Thought203.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    Thought lo2 = Thought390.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Output.points[7][4] -= fd0;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 || fb0;
        fb1 = fd1 < fd0;
        lb0 = fd1 > fd0;
        boolean lb3 = true;
        fd1 *= -1;
        Thought lo4 = Thought88.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb3);
        fd0 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb3);
}
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
        double ld5 = 373.2146790244121;
        double ld6 = 422.5887415888044;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
    ad3 *= -1;
    double ld0 = 834.6713838293839;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    ld0 *= -1;
    boolean lb1 = false;
    ad1 = ad2 - ad3;
if(ao3 != null){
      fb0 = ao3.m2(fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought165.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
    fb1 = !lb1;
    fb0 = fb1 || lb1;
    boolean lb3 = false;
    fd0 = fd1 - ld0;
    double ld4 = 615.8405785697657;
    lb3 = ld4 < ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb1, lb3);
}
    fb0 = fb1 || lb1;
    lb3 = ad2 > ad3;

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Output.points[7][5] += fd0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
        fd0 *= -1;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    boolean lb0 = true;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    Thought lo1 = Thought68.getInstance();
    ab4 = ad2 < ad3;
    fb0 = ad4 > fd0;
if(ao1 != null){
      ao1.m2(fb1, lb0, ab1, ab2);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
    lb0 = lb2 || ab1;
    ad4 = fd0 - fd1;
    ab2 = ab3 || ab4;
    double ld3 = 590.8000648922742;
if(ao2 != null){
      ao1 = ao2.m4(ld3, ad1, ad2, ad3, fb0, fb1, lb0, lb2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    lb2 = ab1 || ab2;

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    double ld0 = 227.79077106710668;
    boolean lb1 = true;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld0;
    lb1 = fd0 > fd1;
    ld0 = fd0 + fd1;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    fb0 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo1.m3(fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    lb1 = fb0 && fb1;
    lb1 = fd1 > ld0;
    fd0 = fd1 - ld0;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    fd0 = fd1 - ld0;
    double ld3 = 108.62273625731578;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo0 != null){
      ab4 = fo0.m2(fd1, fd0, fd1, fd0);
}
    Output.points[7][6] -= fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    Thought lo0 = Thought329.getInstance();
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Output.points[7][7] += fd1;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld0 = 1000.1311378010696;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    double ld2 = 359.24448143215506;
    ad3 = ad4 - fd0;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
    lb1 = !fb0;
    fb1 = !lb1;
    Thought lo3 = Thought44.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ld2, ad1);
    fb0 = !fb1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, ld2, ad1, ad2, fb0, fb1, lb1, fb0);
}
    ad3 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
    ab1 = fd1 < ad1;
    Thought lo0 = Thought292.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    ab2 = ab3 && ab4;
    fb0 = fd1 < ad1;
    fb1 = !ab1;
    ab2 = ab3 && ab4;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad2 *= -1;
    boolean lb3 = false;
    Thought lo4 = Thought131.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb1, lb2, lb3);
}
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb1;
    lb2 = fd0 < fd1;
    Thought lo5 = Thought290.getInstance(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
    boolean lb6 = false;
    ab3 = ad1 < ad2;
    Thought lo7 = Thought50.getInstance(fo1, fo0, fo1, fo0);
    ab4 = !fb0;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Output.points[7][8] += fd0;
    double ld0 = 487.08726980178164;
    fd0 = fd1 - ld0;
    fb0 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    fb1 = fb0 || fb1;
if(ao3 != null){
      fb0 = ao3.m2();
}
if(ao4 != null){
      ao4.m1(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    ad2 = ad3 - ad4;
    Thought lo0 = Thought294.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
    Output.points[8][0] += ad1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo2 = Thought76.getInstance();
    double ld3 = 829.8048453212128;
    Thought lo4 = Thought238.getInstance(fb1, lb1, fb0, fb1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld3, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ld3, ad1, fb0, fb1, lb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    ad2 = ad3 - ad4;
    lb1 = fd0 > fd1;
if(ao1 != null){
      ld3 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || lb1;
    fb0 = fb1 && lb1;
    boolean lb5 = false;
    lb5 = fd1 > ld3;

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    double ld0 = 80.18982495481491;
    ab1 = ld0 > fd0;
    boolean lb1 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    Thought lo2 = Thought395.getInstance();
    fd0 = fd1 - ld0;
    ab1 = fd0 < fd1;
if(ao1 != null){
      ao1.m1(ab2, ab3, ab4, fb0);
}
    fb1 = lb1 && ab1;
    ld0 = fd0 + fd1;
    Thought lo3 = Thought91.getInstance(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
    Output.points[8][1] += fd0;
if(fo1 != null){
      fo1.m1(fd1, ld0, fd0, fd1, fb1, lb1, ab1, ab2);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
    lb1 = ld0 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab1 = ab2 && ab3;
    if (ab4) {
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
    ab3 = ad3 > ad4;
if(ao1 != null){
      ab4 = ao1.m2(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;
if(ao1 != null){
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    ad3 = ad4 - fd0;
    fd1 *= -1;

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        fb0 = fd1 > fd0;
    fb1 = lb0 || fb0;
    Thought lo1 = Thought173.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Thought lo2 = Thought7.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    Output.points[8][2] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought261.getInstance(lb0, fb0, fb1, lb0);
    fb0 = fd0 > fd1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
        lb0 = lb1 && fb0;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    fd0 *= -1;
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    lb3 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(lb0, lb1, lb2, lb3);
}
    boolean lb4 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb2, lb3, lb4, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    fb0 = fd1 > fd0;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought377.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld3 = 946.079976213668;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = lb1 && fb0;
    boolean lb4 = true;
    boolean lb5 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
